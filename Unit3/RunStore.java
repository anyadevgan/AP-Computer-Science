public class RunStore
{
   public static void main( String [] args )
   {
      Grocer g = new Grocer();
      g.add( new Book( "Shantaram", 2, 25 ) );
      g.add( new Fruit( "Lime", 0.5 ) );
      g.add( new Book( "As I Lay Dying", 2.5, 100 ) );
      System.out.println( g );   //remember, this calls g.toString()
      System.out.println( g.totalPages() + " total pages\n" );
      g.increasePrices( 0.1 );
      System.out.println( g );
      g.remove( new Book( "Shantaram", 399, 1 ) );
      System.out.println( g );
      g.add( new Fruit( "Lime", 0.5 ) );
      g.add( new Fruit( "Lime", 0.5 ) );
      System.out.println( g );
      g.remove( new Fruit( "Lime", 0.5 ) );
      System.out.println( g );
   }
}
