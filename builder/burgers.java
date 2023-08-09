public class burgers {
    private String bread;
    private String meat;
    private String lettuce;
    private String tomato;
    private String cheese;

    private burgers(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.cheese = builder.cheese;
    }

    @Override
    public String toString() {
        return "Burger: " +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", lettuce='" + lettuce + '\'' +
                ", tomato='" + tomato + '\'' +
                ", cheese='" + cheese + '\'';
    }

    static class Builder {
        private String bread;
        private String meat;
        private String lettuce;
        private String tomato;
        private String cheese;

        public Builder() {
        }

        public Builder withBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder withMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder withLettuce(String lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Builder withTomato(String tomato) {
            this.tomato = tomato;
            return this;
        }

        public Builder withCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public burgers build() {
            return new burgers(this);
        }
    }
}