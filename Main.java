import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Main {
    //Instantiates global map
    private static Map<String, String> filteredMap = new HashMap<String, String>();

    public static void main(String[] args) {

        String ventasFile = "/workspaces/InterfazPerfumes/Ventas.csv";
        String line = "";

        //Splits the ventasFile file by commas
        try (BufferedReader br = new BufferedReader(new FileReader(ventasFile))) {

            while ((line = br.readLine()) != null) {

                String[] row = line.split(",");
                for (int i = 0; i < row.length; i++) {
                    filteredMap.put(row[2], row[7]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        filterMap();
    }

    //Handles Map Filter
    public static void filterMap(){
        int totalQuantity = 0;
        int filteredRowsNum = 0;
        //Filters results 
        for (Map.Entry<String, String> row : filteredMap.entrySet()) {

            String id = row.getKey();

            //Checks if ID (Starting character) equals C or D
            if(id.charAt(0) == 'C' || id.charAt(0) == 'D'){
                filteredRowsNum++;
                totalQuantity += Integer.parseInt(row.getValue().toString());
                System.out.println(id + "," + row.getValue());
            }
        }
        System.out.println("Total Q: " + totalQuantity + " Filtered Rows " + filteredRowsNum);
    }
}
