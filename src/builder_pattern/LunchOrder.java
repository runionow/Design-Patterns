package builder_pattern;

public class LunchOrder {
    public static class Builder {
        private String _bread;
        private String _meat;
        private String _dressing;
        private String _seasoning;

        public Builder(){}

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread){
            this._bread = bread;
            return this;
        }

        public Builder meat(String meat){
            this._meat = meat;
            return this;
        }

        public Builder dressing(String dressing){
            this._dressing = dressing;
            return this;
        }

        public Builder seasoning(String seasoning){
            this._seasoning = seasoning;
            return this;
        }
    }

    private final String _bread;
    private final String _meat;
    private final String _seasoning;
    private final String _dressing;

    private LunchOrder(Builder builder){
        this._bread = builder._bread;
        this._meat = builder._meat;
        this._dressing = builder._dressing;
        this._seasoning = builder._seasoning;
    }

    public String getBread(){
        return this._bread;
    }

    public String getMeat() {
        return this._meat;
    }

    public String getDressing() {
        return this._dressing;
    }

    public String getSeasoning() {
        return  this._seasoning;
    }

}
