import java.util.ArrayList;
import java.util.Collections;

public class Principal{
	public static void main(String Arg[]){
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		for(int i = 12; i > 3; i--)
		{
			lista.add(new Aluno("joao", i*10));
		}
		Collections.sort(lista);
		for(int i = 0; i < 5; i++)
                {
                        System.out.println(lista.get(i).getIdade() +"--"+ lista.get(i).getNome());
                }

	}
}
