/**
 * Plays as many games of roulette until the user quits or runs out of money.
 * 
 * @authors Robert and Shannon Duvall
 */
public class Main
{
    public static void main (String[] args)
    {
        Game game = new Game();
        String name = ConsoleReader.promtForName();
        Gambler player = new Gambler(name, 1000);

        System.out.println("Hello " + player.myName + 
                           ", let's play " + game.getName());
        System.out.println();

        do
        {
            game.play(player);
        }
        while (player.isSolvent());

        System.out.println();
        System.out.println("Goodbye " + player.myName + 
                           ", thanks for playing!");
    }
}
