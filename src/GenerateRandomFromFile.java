import java.util.*;

public class GenerateRandomFromFile {

    public static void main(String args[]) {

        AProbabilityGeneratorImpl generator = new AProbabilityGeneratorImpl();
        int n = 100;

        String[] result = new String[n];

        for(int i=0;i<n; i++) {
            result[i] = generator.getNextString();
        }

        Arrays.sort(result);

        for(int i = 0; i < n ; i++) {
            int count = 1;
            while(i < n-1 && result[i] == result[i+1]) {
                count++;
                i++;
            }
            System.out.println("i : " + i + " count: " + count);
        }
    }
}

class AProbabilityGeneratorImpl {

    private Map<String, Float> stringDistribution;
    private String[] allString;
    private Random random;

    AProbabilityGeneratorImpl() {
        stringDistribution = new HashMap<>();
        stringDistribution.put("First", 0.5f);
        stringDistribution.put("Second", 0.3f);
        stringDistribution.put("Third", 0.15f);
        stringDistribution.put("Fourth" , 0.05f);
        allString = new String[100];
        random = new Random();
        preComputeDistributionArray(stringDistribution);
    }

    private void preComputeDistributionArray(Map<String, Float> stringDistribution) {
        Set<String> set = stringDistribution.keySet();
        int index = 0;
        for(String s : set) {
            Float val = stringDistribution.get(s);
            for(int i = 0; i < (int)(val*100); i++) {
                allString[index++] = s;
            }
        }
    }

    String getNextString() {
        int randomIndex = random.nextInt(100);
        return allString[randomIndex];
    }
}
