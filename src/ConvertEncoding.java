public class ConvertEncoding {

    public static void main(String[] args) {

        try {
            String encodedWithISO88591 = "Pendant l?admission";
            String decodedToUTF8 = new String(encodedWithISO88591.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(decodedToUTF8);
//Result, decodedToUTF8 --> "üzüm bağları"
        }catch (Exception e) {

        }

    }
}
