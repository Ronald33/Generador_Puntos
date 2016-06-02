import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class App
{
    public static void main(String[] args) throws IOException 
    {
    	String result = "";
    	try
    	{
    		// REDUCE //
    		int n = 22;
    		double it = Math.pow(2, n);
    		String file_reduce = "REDUCE_" + it;
    		
    		File file = new File(file_reduce);
            FileWriter writer = new FileWriter(file, true);
    		
    		int it1 = (int) it / 3;
    		int it2 = (int) it / 3;
    		int it3 = (int) (it / 3) + 1;
    		
    		for (int i = 0; i < it1; i++)
    		{
        		float p1 = Helper.getRandom(0.4f, 0.5f);
        		float p2 = Helper.getRandom(0.2f, 0.3f);
        		float p3 = 1 - p1 - p2;
    			result += p1 + " " + p2 + " " + p3 + "\n";
//    			Helper.writeFile(file_reduce, result);
			}
    		
    		for (int i = 0; i < it2; i++)
    		{
        		float p1 = Helper.getRandom(0.2f, 0.3f);
        		float p2 = Helper.getRandom(0.5f, 0.6f);
        		float p3 = 1 - p1 - p2;
    			result += p1 + " " + p2 + " " + p3 + "\n";
//    			Helper.writeFile(file_reduce, result);
			}
    		
    		for (int i = 0; i < it3; i++)
    		{
        		float p1 = Helper.getRandom(0.2f, 0.3f);
        		float p2 = Helper.getRandom(0.2f, 0.3f);
        		float p3 = 1 - p1 - p2;
    			result += p1 + " " + p2 + " " + p3 + "\n";
//    			Helper.writeFile(file_reduce, result);
			}
    		
    		writer.write(result);
            writer.close();
            result = "";
    		
    		// MAP //
//    		int n = 5;
//    		double it = Math.pow(2, n);
            String result2 = "";
    		String file_map = "MAP_" + it;
            File file2 = new File(file_map);
            FileWriter writer2 = new FileWriter(file2, true);
//    		Helper.createFile(file_map);
//    		int it1 = (int) it / 3;
//    		int it2 = (int) it / 3;
//    		int it3 = (int) (it / 3) + 1;
    		
    		for (int i = 0; i < it1; i++)
    		{
        		float p1 = Helper.getRandom(0.4f, 0.5f);
        		float p2 = 1 - p1;
    			result += p1 + " " + p2 + "\n";
//    			Helper.writeFile(file_map, result);
			}
    		
    		for (int i = 0; i < it2; i++)
    		{
    			float p1 = Helper.getRandom(0.2f, 0.3f);
        		float p2 = 1 - p1;
    			result += p1 + " " + p2 + "\n";
//    			Helper.writeFile(file_map, result);
			}
    		
    		for (int i = 0; i < it3; i++)
    		{
    			float p1 = Helper.getRandom(0.5f, 0.6f);
        		float p2 = 1 - p1;
    			result += p1 + " " + p2 + "\n";
//    			Helper.writeFile(file_map, result);
			}
    		
    		writer2.write(result);
            writer2.close();

    		System.out.println("Archivos generados correctamente =)");
    	}
    	catch(Exception e)
    	{
    		System.err.println(e.getMessage());
    	}
    }
}