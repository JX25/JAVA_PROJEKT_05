import java.util.ArrayList;
import java.util.Collections;

public class Algorytm1  {

    public int solution(ArrayList<Integer> listaA)
    {
        if( listaA == null ) throw new IllegalArgumentException("Lista jest niezainicjalizowana!");
        if( listaA.size() == 0 ) throw new IllegalArgumentException("Lista jest pusta!");
        if( listaA.size() > 1E5 ) throw new IllegalArgumentException("Lista za dluga!");
        for( int i=0; i< listaA.size() ; i++) if( listaA.get(i)<(-1*-1000000) || listaA.get(i)>1000000) throw new IllegalArgumentException("Liczba jest za duza!");

        ArrayList<Integer> listaB = new ArrayList<Integer>(listaA);
        Collections.sort(listaB);
        int i=0;
        while( listaB.get(i) <= 0 && i < listaB.size() - 1 ) i++;
        //if( i == listaB.size() -1 && listaB.get(i) > 1 ) return 1;
        if( i == listaB.size() -1 && listaB.get(i) == 1 ) return 2;
        else if( i == listaB.size() -1) return 1;

        for(; i < listaB.size(); i++ )
        {
            if(i == 0) continue;
            if( ( listaB.get(i) - listaB.get(i-1) ) > 1 && listaB.get(i-1) >= 0)
            {
                if( listaB.get(i-1) > 0 ) return listaB.get(i-1) + 1;
                else return listaB.get(i)-1;
            }
            if( i == listaB.size()-1 ) return listaB.get(i)+1;
        }
        return 1;
    }

}
