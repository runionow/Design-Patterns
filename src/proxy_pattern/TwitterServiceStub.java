package proxy_pattern;

public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeline(String screenName) {
        return "My Twitter timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
