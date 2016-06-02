import java.io.File;
import java.io.FileWriter;
import java.util.Random;

abstract public class Helper
{
	public static void createFile(String filename) throws Exception
	{
		File file = new File(filename);
        if (!file.createNewFile())
        {
        	throw new Exception("El archivo: " + filename + " ya existe");
        }
	}
	
	public static void writeFile(String filename, String content) throws Exception
	{
		File file = new File(filename);
        FileWriter writer = new FileWriter(file, true);
        writer.write(content);
        writer.close();
	}
	
	public static float getRandom(float ini, float fin)
	{
		Random r = new Random();
		float result = r.nextFloat() * (fin - ini) + ini;
		return result;
	}
}
