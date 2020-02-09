package game;

import gameoflife.Simulator;

public class Main {

//    public static void main(String[] args) {
//        PersonalBoard board = new PersonalBoard(10, 10);
//
////        board.turnToLiving(0, 1);
//        board.turnToLiving(1, 0);
//        board.turnToLiving(1, 1);
//        board.turnToLiving(1, 2);
//        board.turnToLiving(2, 2);
//        board.turnToLiving(2, 1);
//        int no = board.getNumberOfLivingNeighbours(1, 1);
////        System.out.println(no);
//        
//        board.manageCell(1, 1, no);
//
//        GameOfLifeTester tester = new GameOfLifeTester(board);
//        tester.play();
//}
        public static void main(String[] args) {
        PersonalBoard board = new PersonalBoard(100, 100);
        board.initiateRandomCells(0.7);

        Simulator simulator = new Simulator(board);
        simulator.simulate();
    
    }
    

    
}
