package com.winterbe.react;

import jdk.nashorn.api.scripting.NashornScriptEngine;

import javax.script.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class React {

    private ThreadLocal<CompiledScript> scriptHolder = new ThreadLocal<CompiledScript>(){
        @Override
        protected CompiledScript initialValue() {

            String script = Stream.of("static/nashorn-polyfill.js",
                    "static/vendor/react.js",
                    "static/vendor/showdown.min.js",
                    "static/commentBox.js")
                    .map(ThrowingFunction.wrap(React::slurp)).collect(Collectors.joining());

            try {
                ScriptEngine engine =  new ScriptEngineManager().getEngineByName("JavaScript");
                Compilable compilingEngine = (Compilable) engine;
                CompiledScript cs = compilingEngine.compile(script);

                Bindings bindings = engine.getBindings(ScriptContext.ENGINE_SCOPE);
                cs.eval(bindings);
                return cs;
            } catch (ScriptException e) {
                throw new RuntimeException(e);
            }
        }
    };

    public  String renderCommentBox(List<Comment> comments) {
        try {
            CompiledScript cscript = scriptHolder.get();

            Invocable invocable = (Invocable) cscript.getEngine();

            return String.valueOf(invocable.invokeFunction("renderServer", comments));
        }
        catch (Exception e) {
            throw new IllegalStateException("failed to render react component", e);
        }
    }

    public static String slurp(String path) throws java.io.IOException {
        try (InputStream resource = React.class.getClassLoader().getResourceAsStream(path)) {
            return String.join("\n", new BufferedReader(new InputStreamReader(resource,
                    StandardCharsets.UTF_8)).lines().collect(Collectors.toList())) + "\n";
        }
    }
}