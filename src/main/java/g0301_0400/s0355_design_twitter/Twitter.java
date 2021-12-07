package g0301_0400.s0355_design_twitter;

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Linked_List

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Twitter {
    // userId --> user followers
    private Map<Integer, HashSet<Integer>> twitter;
    // head of linked list that stores all the tweets
    private Tweet head;

    public Twitter() {
        head = new Tweet(-1, -1);
        twitter = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        checkNewUser(userId);
        Tweet t = new Tweet(userId, tweetId);
        Tweet next = head.next;
        head.next = t;
        t.next = next;
    }

    public List<Integer> getNewsFeed(int userId) {
        checkNewUser(userId);
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> followers = twitter.get(userId);
        Tweet t = head.next;
        while (t != null && res.size() < 10) {
            if (followers.contains(t.userId)) {
                res.add(t.tweetId);
            }
            t = t.next;
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        checkNewUser(followeeId);
        checkNewUser(followerId);
        twitter.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        checkNewUser(followeeId);
        // cannot unfollower yourself
        if (followerId == followeeId) {
            return;
        }
        checkNewUser(followerId);
        twitter.get(followerId).remove(followeeId);
    }

    public void checkNewUser(int userId) {
        if (twitter.containsKey(userId)) return;
        twitter.put(userId, new HashSet<>());
        // follow  yourself
        twitter.get(userId).add(userId);
    }
}
