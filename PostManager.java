import java.util.*;

public class PostManager {

    
    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) return 0;

        int total = 0;
        for (int interaction : interactions) {
            total += interaction;
        }
        return total;
    }


    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        if (engagementScore >= 500) return "Popular";
        if (engagementScore >= 100) return "Good";
        if (engagementScore >= 50) return "Low";
        return "Poor";
    }


    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }


    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }


    public ArrayList<String> manageHashtags(String[] hashtags) {
        ArrayList<String> uniqueList = new ArrayList<>();
        if (hashtags == null || hashtags.length == 0) return uniqueList;

        Set<String> uniqueSet = new HashSet<>();
        for (String tag : hashtags) {
            if (tag != null && uniqueSet.add(tag)) {
                uniqueList.add(tag);
            }
        }
        return uniqueList;
    }


    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();

        if (posts == null || postEngagement == null) return trending;

        for (String post : posts) {
            if (post != null && postEngagement.containsKey(post)) {
                int score = postEngagement.get(post);
                if (score > 500) {
                    trending.add(post);
                }
            }
        }
        return trending;
    }


    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> uniqueAuthors = new HashSet<>();
        if (authors == null) return uniqueAuthors;

        for (String author : authors) {
            if (author != null) {
                uniqueAuthors.add(author);
            }
        }
        return uniqueAuthors;
    }


    public static void main(String[] args) {
        PostManager manager = new PostManager();


        String postTitle = "Java Programming Tips";
        int engagementScore = manager.calculateEngagement(150, 75, 25); // likes, comments, shares
        String category = manager.getCategoryRating(engagementScore);


        System.out.println("=== Post Stats (Basic) ===");
        manager.displayPostStats(postTitle, engagementScore);

        System.out.println("\n=== Post Stats (With Category) ===");
        manager.displayPostStats(postTitle, engagementScore, category);


        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);
        System.out.println("\n=== Unique Hashtags ===");
        System.out.println(uniqueHashtags);


        ArrayList<String> posts = new ArrayList<>();
        posts.add("Java Programming Tips");
        posts.add("Daily Coding Challenges");
        posts.add("Low Engagement Post");

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", engagementScore);
        postEngagement.put("Daily Coding Challenges", 1200);
        postEngagement.put("Low Engagement Post", 40);

        LinkedList<String> trendingPosts = manager.findTrendingPosts(posts, postEngagement);
        System.out.println("\n=== Trending Posts (Engagement > 500) ===");
        System.out.println(trendingPosts);


        HashSet<String> uniqueAuthors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("\n=== Unique Authors ===");
        System.out.println(uniqueAuthors);
    }
}
