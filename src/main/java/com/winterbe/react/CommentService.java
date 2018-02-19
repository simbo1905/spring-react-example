package com.winterbe.react;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    private List<Comment> comments = new ArrayList<>();

    public CommentService() {
        comments.add(new Comment("Mark Twain", "Twenty years from now you will be more disappointed by the things that you didn't do than by the ones you did do. So throw off the bowlines. Sail away from the safe harbor. Catch the trade winds in your sails. Explore. Dream. Discover."));
        comments.add(new Comment("John Cage", "I can't understand why people are frightened of new ideas. I'm frightened of the old ones."));
        comments.add(new Comment("Thomas Carlyle", "The tragedy of life is not so much what men suffer, but rather what they miss."));
        comments.add(new Comment("Elbert Hubbard", "The greatest mistake you can make in life is to be continually fearing you will make one."));
        comments.add(new Comment("Albert Einstein", "Anyone who has never made a mistake has never tried anything new."));
        comments.add(new Comment("Warren Buffett", "It's better to hang out with people better than you. Pick out associates whose behavior is better than yours and you'll drift in that direction."));
        comments.add(new Comment("Ayn Rand", "The question is not who is going to let me, it's who is going to stop me."));
        comments.add(new Comment("Malcolm Forbes", "The dumbest people I know are those who know it all."));
        comments.add(new Comment("George Eliot", "If what you’re doing is not your passion, you have nothing to lose."));
        comments.add(new Comment("", "The person who says something is impossible should not interrupt the person who is doing it."));
        comments.add(new Comment("Walt Disney", "All our dreams can come true – if we have the courage to pursue them."));
        comments.add(new Comment("Albert Ellis", "The best years of your life are the ones in which you decide your problems are your own. You do not blame them on your mother, the ecology, or the president. You realize that you control your own destiny."));
        comments.add(new Comment("Milton Berle", "If opportunity doesn’t knock, build a door."));
        comments.add(new Comment("Mark Twain", "Let us so live that when we come to die even the undertaker will be sorry."));
        comments.add(new Comment("Lao Tzu", "A good traveler has no fixed plans, and is not intent on arriving."));
        comments.add(new Comment("Saint Augustine", "The World is a book, and those who do not travel read only a page."));
        comments.add(new Comment("Alan Keightley", "Once in a while it really hits people that they don't have to experience the world in the way they have been told to."));
        comments.add(new Comment("Debbi Fields", "The important thing is not being afraid to take a chance. Remember, the greatest failure is to not try. Once you find something you love to do, be the best at doing it."));
        comments.add(new Comment("Dr. Seuss", "Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind."));
        comments.add(new Comment("Eleanor Roosevelt", "Yesterday is history. Tomorrow is a mystery. Today is a gift. That's why we call it 'The Present'."));
        comments.add(new Comment("Mark Twain", "Whenever you find yourself on the side of the majority, it is time to pause and reflect."));
        comments.add(new Comment("Tony Hsieh", "Money alone isn't enough to bring happiness . . . happiness [is] when you're actually truly ok with losing everything you have."));
        comments.add(new Comment("Oscar Wilde", "To live is the rarest thing in the world. Most people exist, that’s all."));
        comments.add(new Comment("Napoleon Hill", "Don't wait. The time will never be just right."));
        comments.add(new Comment("Mahatma Gandhi", "Live as if you were to die tomorrow. Learn as if you were to live forever."));
        comments.add(new Comment("Karen Lamb", "A year from now you may wish you had started today."));
        comments.add(new Comment("Mahatma Gandhi", "Live simply, so others may simply live."));
        comments.add(new Comment("Antoine de Saint-Exupery", "Perfection is achieved, not when there is nothing more to add, but when there is nothing left to take away."));
        comments.add(new Comment("Albert Einstein", "We act as though comfort and luxury were the chief requirements of life, when all that we need to make us happy is something to be enthusiastic about."));
        comments.add(new Comment("Jon Bentley and Douglas McIlroy", "The key to performance is elegance, not battalions of special cases."));
        comments.add(new Comment("John Le Carre", "A desk is a dangerous place from which to view the world."));
        comments.add(new Comment("Elbert Hubbard", "One machine can do the work of fifty ordinary men. No machine can do the work of one extraordinary man."));
        comments.add(new Comment("Elbert Hubbard", "Folks who never do any more than they are paid for, never get paid more than they do."));
        comments.add(new Comment("Faith Popcorn", "The trouble in corporate America is that too many people with too much power live in a box (their home), then travel the same road every day to another box (their office)."));
        comments.add(new Comment("David Ramsey", "We buy things we don't need with money we don't have to impress people we don't like."));
        comments.add(new Comment("Theodore Roosevelt", "It is hard to fail, but it is worse never to have tried to succeed."));
        comments.add(new Comment("Seth Godin", "Instead of wondering when your next vacation is, maybe you should set up a life you don't need to escape from."));
        comments.add(new Comment("Pappy Van Winkle", "We make a fine bourbon, at a profit if we can, at a loss if we must, but always FINE BOURBON."));
        comments.add(new Comment("Winston Churchill", "An army of lions led by a sheep is no match for an army of sheep led by a lion."));
        comments.add(new Comment("Grace Hopper", "A ship in port is safe, but that is not what ships are for. "));
        comments.add(new Comment("Mark Twain", "I never let my schooling get in the way of my education"));
        comments.add(new Comment("Roger Staubach", "There are no traffic jams along the extra mile."));
        comments.add(new Comment("Albert Einstein", "The world is a dangerous place, not because of those who do evil, but because of those who look on and do nothing."));
        comments.add(new Comment("Johann Wolfgang von Goethe", "Whatever you think you can do or believe you can do, begin it. Action has magic, grace and power in it."));
        comments.add(new Comment("George Woodberry", "Defeat is not the worst of failures.  Not to have tried is the true failure."));
        comments.add(new Comment("James Cash Penney ", "It is always the start that requires the greatest effort."));
        comments.add(new Comment("Thomas Edison", "The best thinking has been done in solitude."));
        comments.add(new Comment("Dave Ramsey", "If you will live like no one else, later you can live like no one else."));
        comments.add(new Comment("Samuel Goldwyn", "The harder I work, the luckier I get."));
        comments.add(new Comment("Maya Angelou", "Life is not measured by the number of breaths we take, but by the moments that take our breath away."));
        comments.add(new Comment("Victoria Holt", "Never regret. If it's good, it's wonderful. If it's bad, it's experience."));
        comments.add(new Comment("Aristotle", "We are what we repeatedly do. Excellence, then is not an act but a habit."));
        comments.add(new Comment("NULL", "Don’t make a decision based solely on popularity. Just because other people are doing it doesn’t mean it’s the best choice for you."));
        comments.add(new Comment("NULL", "Sometimes you need to be alone to reflect on life.  Take time out to take care of yourself.  You deserve it."));
        comments.add(new Comment("Thomas Jefferson", "One travels more usefully when alone, because he reflects more."));
        comments.add(new Comment("Jim Rohn", "We must all suffer one of two things: the pain of discipline or the pain of regret and disappointment."));
        comments.add(new Comment("Thomas Alva Edison", "I haven't failed, I've just found 10,000 ways that don't work."));
        comments.add(new Comment("Nassim Nicholas Taleb", "The three most harmful addictions are heroin, carbohydrates and a monthly salary."));
        comments.add(new Comment("Ron Swanson", "Never half-ass two things, whole-ass one thing."));
        comments.add(new Comment("C. S. Lewis", "Humility is not thinking less of yourself, it's thinking of yourself less."));
        comments.add(new Comment("Charles Dickens", "Every traveler has a home of his own, and he learns to appreciate it the more from his wandering."));

        comments.add(new Comment("Walter Anderson", "Nothing diminishes anxiety faster than action."));
        comments.add(new Comment("Jim Rohn", "If you don't design your own life plan, chances are you'll fall into someone else's plan."));
        comments.add(new Comment("Shantideva", "If you can solve your problem, then what is the need of worrying? If you cannot solve it, then what is the use of worrying?"));
        comments.add(new Comment("Steve Jobs", "Sometimes life is going to hit you in the head with a brick. Dont lose faith."));
        comments.add(new Comment("Eleanor Roosevelt", "It takes as much energy to wish as it does to plan."));
        comments.add(new Comment("Oscar Wilde", "I am so clever that sometimes I don't understand a single word of what I am saying."));
        comments.add(new Comment("Sarah Ban Breathnach", "The world needs dreamers and the world needs doers. But above all, the world needs dreamers who do."));
        comments.add(new Comment("A. McLaughlin", "When you listen, it's amazing what you can learn. When you act on what you've learned, it's amazing what you can change."));
        comments.add(new Comment("Leonardo Da Vinci", "Simplicity is the ultimate sophistication."));
        comments.add(new Comment("Carl W. Buechner", "They may forget what you said, but they will never forget how you made them feel."));
        comments.add(new Comment("Angela Wright", "Be too busy to have time for regrets."));
        comments.add(new Comment("Prue Leith", "Don't spend time with anyone you don't like."));
        comments.add(new Comment("Ted Smart", "Work hard but make sure you enjoy life too."));
        comments.add(new Comment("Darren Richards", "You only get one crack at a big opportunity so make sure you recognize it and grab it with both hands."));
        comments.add(new Comment("Brian Tracy", "The more reasons you have for achieving your goal, the more determined you will become."));
        comments.add(new Comment("James M. Barrie", "Nothing is really work unless you would rather be doing something else."));
        comments.add(new Comment("John Ruskin", "The highest reward for a person's toil is not what they get for it, but what they become by it."));
        comments.add(new Comment("Aristotle", "Pleasure in the job puts perfection in the work."));
        comments.add(new Comment("J. C. Penney", "Long-range goals keep you from being frustrated by short-term failures."));

        comments.add(new Comment("Albert Payson", "Win without boasting. Lose without excuse."));
        comments.add(new Comment("Stephen King", "Talent is cheaper than table salt. What separates the talented individual from the successful one is a lot of hard work."));
        comments.add(new Comment("Richard Bandler", "Don't re-open old wounds in order to examine their origins. Leave them healed."));
        comments.add(new Comment("Brian Tracy", "The act of taking the first step is what separates the winners from the losers."));
        comments.add(new Comment("Dr. Joe Vitale", "A goal should scare you a little, and excite you a lot."));
        comments.add(new Comment("Mark Twain", "A person who won't read has no advantage over one who can't read."));
        comments.add(new Comment("Nelson Mandela", "It always seems impossible until it's done."));
        comments.add(new Comment("Christopher Morley", "There is only one success - to be able to spend your life in your own way."));

    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Comment> addComment(Comment comment) {
        comments.add(comment);
        return comments;
    }
}
