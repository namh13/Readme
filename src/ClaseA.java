import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


 class A {
		static int x;
		final int y=200;
	}
public class ClaseA {

	
	public static void main(String[] args) {

		/*A a = new A();
		A b = new A();
		a.x = 100;
		a.y = 300;
		System.out.print(a.x);/*/
		
		File f;
		f = new File("miarchivo");
		try
		{
			FileWriter w = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);
			wr.write("Escribiendo en mi archivo ");
			wr.append("Escribiendo un poco mas");
			wr.close();
			bw.close();
		}catch(Exception e)
		{
		};
		
		try
		{
			FileReader r = new FileReader(f);
			BufferedReader br = new BufferedReader(r);
			String linea;
			while((linea = br.readLine())!=null)
			System.out.println(linea);
		}catch(Exception e)
		{};
	}

}
