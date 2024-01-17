package collection_examples;

public class EnumExample {
    public static void main(String[] args) {
        System.out.println(enumExample.MONDAY);
        System.out.println("HI");
    }


    public enum enumExample {
        MONDAY("mon");

        String abb;
         enumExample(String abb){
            System.out.println("Inside Enum");
            this.abb = abb;
        }

        public String getAbb() {
            return abb;
        }
    }
}

