package info.hccis.layoutpresentation.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Camper> CAMPERS = new ArrayList<Camper>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Camper> CAMPER_MAP = new HashMap<String, Camper>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addCamper(createCamper(1, "Marc", "Blachard", "01/01/2000"));
        addCamper(createCamper(2, "Maxim", "Marmo", "01/01/2000"));
    }

    private static void addCamper(Camper item) {
        CAMPERS.add(item);
        CAMPER_MAP.put(item.id, item);
    }

    private static Camper createCamper(int position, String firstName, String lastName, String dob) {
        return new Camper(String.valueOf(position), firstName, lastName, dob);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Camper: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Camper {
        public final String id;
        public final String firstName;
        public final String lastName;
        public final String dob;


        public Camper(String id, String firstName, String lastName, String dob) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.dob = dob;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
}
