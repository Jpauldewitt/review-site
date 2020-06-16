package org.wecancodeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review Overwatch = new Review(1L,
                "Overwatch",
                "Team based, first person shooter, designed by Blizzard",
                "./images/overwatch.jpeg",
                "Video Games","1st Person Shooter",
                "Great team game","Online Community is brutal",
                "Overwatch, what a great game, for people who are good at first person shooters! "+
                        " Beware this isn't for the average gamer."+
                        " If you like competitive first person shooters, this one's for you." +
                        " My advice: remember to put on your big boy pants, strap on your serious gamer face, and get with it." +
                        " Don't forget your A game, because if you don't, someone will let you know that you forgot it."
        );
        Review Diablo3 = new Review (2L,
                "Diablo 3",
                "Actoin RGP designed by Blizzard to give users the ability to annihilate all sorts of creatures by smashing buttons on a controller",
                "./images/diablo3Pic.jpg",
                "Video Games", "Action RPG",
                "Great graphics","Gets repetitive",
                "Diablo 3 is such a fun game, until your brain switches back on from off mode." +
                        " At that moment in time you are hit with the reality that you should probably be playing" +
                        " something else, or maybe even doing something with your life."
                );

        Review Banana = new Review (3L,
                "Banana",
                "Uniquely distinguished by it's yellow outer peeling, the banana features an edible cream like colored interior.",
                "./images/bananaPic.jpg",
                "Food","Fruit",
                "Unique flavor", "They go bad quickly",
                "Who doesn't love bananas. I mean they are great right? If you have been living in a cave, and for whatever reason"+
                        " have never tried one, stop what you are doing, and go! Now! "
                );

        Review Tiger = new Review (4L,
                "Tiger",
                "Striped animal belonging to the feline family.",
                "./images/tigerPic.jpg",
                "Animal",
                "Cool looking fur",
                "Cool looking fur.",
                "They will eat you.",
                "This fur-ocious (ha.. see what I did there) creatures are just amazing. "+
                        "From what I have learned recently, is that if you own enough of these creatures" +
                        " you can pretty much run for mayor, expose the truth about Carol Baskin, and make "+
                        " your own music videos. Pretty neat huh?"
                );

        Review MarkWahlberg = new Review (5L,
                "Mark Wahlberg",
                "Artist, Musician from Boston",
                "./images/markWahlbergPic.jpg",
                "Actor/Actress",
                "Good",
                "Wicked Boston accent.",
                "Sometimes he is a peakcock, and you gotta let him fly.",
                "What a great actor, most of the time."
                );

        reviewsList.put(Diablo3.getId(),Diablo3);
        reviewsList.put(Overwatch.getId(),Overwatch);
        reviewsList.put(Banana.getId(),Banana);
        reviewsList.put(Tiger.getId(),Tiger);
        reviewsList.put(MarkWahlberg.getId(),MarkWahlberg);
    }

    public ReviewRepository(Review ...reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection <Review> findAll() {
        return reviewsList.values();
    }
}