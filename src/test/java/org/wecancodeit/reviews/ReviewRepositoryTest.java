package org.wecancodeit.reviews;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;

public class ReviewRepositoryTest {

        private ReviewRepository underTest;
        private Review Diablo3 = new Review (2L, "Diablo 3", "description here", "./images/",
                "Video Game", "Action RPG", "Great graphics","Gets repetitive", "Review here:");

        private Review Overwatch = new Review (1L, "Overwatch", "SuperCool", "./images/overwatch.jpeg",
                "Video Game","first person shooter", "Great team game","Online Community is brutal", "Review here:");

        @Test
        public void shouldFindOneReview(){
            underTest = new ReviewRepository(Diablo3);
            Review foundReview = underTest.findOne(1L);
            Assertions.assertThat(foundReview).isEqualTo(Diablo3);
        }

        @Test
        public void shouldFindBothReviews(){
            underTest = new ReviewRepository(Diablo3, Overwatch);
            Collection<Review> foundReviews = underTest.findAll();
            Assertions.assertThat(foundReviews).contains(Diablo3,Overwatch);
        }
}
