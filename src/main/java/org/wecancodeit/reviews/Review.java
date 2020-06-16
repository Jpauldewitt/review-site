package org.wecancodeit.reviews;

public class Review {
        private long id;
        private String item;
        private String description;
        private String imageUrl;
        private String category;
        private String categoryInception;
        private String positives;
        private String negatives;
        private String reviewSection;


        public Review(long id, String item, String description, String imageUrl, String category, String categoryInception, String positives, String negatives, String reviewSection) {
            this.id= id;
            this.item = item;
            this.description = description;
            this.imageUrl = imageUrl;
            this.category = category;
            this.categoryInception = categoryInception;
            this.positives = positives;
            this.negatives = negatives;
            this.reviewSection = reviewSection;
        }

        public Long getId() {
            return id;
        }

        public String getItem(){
            return item;
        }

        public String getImageUrl(){
            return imageUrl;

        }
        public String getCategory(){
            return category;
        }

        public String getCategoryInception(){
            return categoryInception;
        }

        public String getPositives(){
            return positives;
        }

        public String getNegatives(){
            return negatives;
        }

        public String getReviewSection(){
            return reviewSection;
        }

        public String getDescription(){
            return description;
        }
}

