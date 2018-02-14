package com.winterbe.react;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.script.*;

public class ReactTest {

    @Test
    public void testRenderCommentBox() throws Exception {

        System.out.println("-------------");
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment("Peter Parker", "This is a comment."));
        comments.add(new Comment("John Doe", "This is *another* comment."));

        React react = new React();
        String html = react.renderCommentBox(comments);

        assertThat(html, startsWith("<div"));

        Document doc = Jsoup.parse(html);
        assertThat(doc.select("div.comment").size(), is(2));

        for( int i = 0; i < 100;i++ ) {
            long startTime = System.nanoTime();
            react.renderCommentBox(comments);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            double milli = duration / 1e6;
            System.out.println(String.format("%.2f", milli));
        }
    }

    @Test
    public void testCompiledRenderCommentBox() throws Exception {

        System.out.println("-------------");
        String script = Stream.of("static/nashorn-polyfill.js",
                "static/vendor/react.js",
                "static/vendor/showdown.min.js",
                "static/commentBox.js")
                .map(ThrowingFunction.wrap(React::slurp)).collect(Collectors.joining());

        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment("Peter Parker", "This is a comment."));
        comments.add(new Comment("John Doe", "This is *another* comment."));

        React react = new React();
        String html = react.compiledRenderCommentBox(comments);

        assertThat(html, startsWith("<div"));

        Document doc = Jsoup.parse(html);
        assertThat(doc.select("div.comment").size(), is(2));

        for( int i = 0; i < 100;i++ ) {
            long startTime = System.nanoTime();
            react.compiledRenderCommentBox(comments);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            double milli = duration / 1e6;
            System.out.println(String.format("%.2f", milli));
        }
    }
}