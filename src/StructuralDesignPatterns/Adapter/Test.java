package StructuralDesignPatterns.Adapter;

public class Test {
    public static void main(String[] args) {
        RoundHole roundHole=new RoundHole(5);
        RoundPeg roundPeg=new RoundPeg(5);
        if(roundHole.fits(roundPeg)){
            System.out.println("Round peg r5 fits round hole r5.");
        }


        SquarePeg squarePeg=new SquarePeg(5);
        SquarePeg squarePeg3=new SquarePeg(3);
        SquarePeg squarePeg2=new SquarePeg(10);
        SquarePegAdapter roundPegAdapter=new SquarePegAdapter(squarePeg);
        SquarePegAdapter roundPegAdapter2=new SquarePegAdapter(squarePeg2);
        if(roundHole.fits(roundPegAdapter)){
            System.out.println("Square peg r5 fits round hole r5.");
        }
        if(!roundHole.fits(roundPegAdapter2)){
            System.out.println("Square peg r10 doesnt fits round hole r5.");
        }
    }
}
