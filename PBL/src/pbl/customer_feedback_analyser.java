package pbl;
import java.util.*;
import java.util.regex.*;
public class customer_feedback_analyser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> feedbackList = new ArrayList<>();

        // ✅ 1️⃣ Take 3 feedback messages from the user
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter feedback " + i + ": ");
            feedbackList.add(sc.nextLine());
        }

        // ✅ 2️⃣ Clean and mask each feedback
        System.out.println("\n📋 Cleaned & Masked Feedback:");
        List<String> cleanedList = new ArrayList<>();
        for (String fb : feedbackList) {
            String cleaned = fb.trim().replaceAll("[^a-zA-Z0-9@.\\s]", ""); // clean
            cleaned = cleaned.replaceAll("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}", "[EMAIL]"); // mask email
            cleaned = cleaned.replaceAll("\\b\\d{10}\\b", "[PHONE]"); // mask phone
            cleanedList.add(cleaned);
            System.out.println("- " + cleaned);
        }

        // ✅ 3️⃣ Count a keyword
        System.out.print("\nEnter a keyword to count: ");
        String keyword = sc.nextLine().toLowerCase();
        int count = 0;
        for (String fb : cleanedList) {
            count += fb.toLowerCase().split("\\b" + keyword + "\\b", -1).length - 1;
        }
        System.out.println("✅ The keyword '" + keyword + "' appeared " + count + " time(s).");

        // ✅ 4️⃣ Quick Report
        int totalWords = 0;
        for (String fb : cleanedList) {
            if (!fb.trim().isEmpty()) {
                totalWords += fb.trim().split("\\s+").length;
            }
        }
        double avgWords = (double) totalWords / cleanedList.size();
        System.out.println("\n📊 Total feedbacks: " + cleanedList.size());
        System.out.println("📊 Average words per feedback: " + avgWords);

        sc.close();
    }
}

