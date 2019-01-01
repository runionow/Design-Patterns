package proxy_pattern;

import com.pluralsight.proxy.TwitterServiceImpl;

/*
 * Interface by wrapping
 * Can add functionality
 * Security, Simplicity REmote Cost
 * Proxy called to access real object
 */
public class ProxyMain {
    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
        System.out.println(service.getTimeline("anekkal"));


    }
}
