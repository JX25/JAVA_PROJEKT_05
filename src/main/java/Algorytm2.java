import java.util.ArrayList;
public class Algorytm2 {

    public int solution(int array[])
    {
        if( array == null ) throw  new IllegalArgumentException("Niezainicjalizowana lista!");
        if( array.length == 0 ) throw new IllegalArgumentException("Lista jest pusta!");
        if( array.length > 10 ) throw new IllegalArgumentException("Liczba jest za długa!");
        for( int i = 0; i < array.length ; i++)
        {
            if( array[i] / 10 > 0 ) throw new IllegalArgumentException("W liscie wystepuje liczba zamiast cyfry");
        }
        if( array[array.length-1] == 0 ) throw new IllegalArgumentException("Liczba nie powinna zawierac zera na poczatku! / Lista pusta!");

        if( array[array.length-1] < 0 )
        {
            for( int  i = 0; i < array.length - 1; i++) if( array[i] < 0 ) throw new IllegalArgumentException("W liczbie wystepuja dwie lub wiecej ujemne wartosci!");
            //list.set( list.size() - 1 , list.get( list.size() -1 ) * -1  );
            array[array.length-1] = -1*array[array.length-1];
        }


        int wlasciwaLiczba = 0;
        for( int i = 0; i < array.length ; i++ )
        {
            wlasciwaLiczba += array[i]*Math.pow(10,i);
        }
        wlasciwaLiczba *= 17;
        int sumaCyfr = 0;
        do{
            sumaCyfr += wlasciwaLiczba%10;
            wlasciwaLiczba /= 10;
        }while(wlasciwaLiczba>0);
        return sumaCyfr;
    }

}
