package sample;

public class NodeList {

    static myNode myNode1;
    static myNode myNode2;
    static myNode myNode3;
    static myNode myNode4;
    static myNode myNode5;



    static public void createNodes() {
        myNode1 = new myNode(1, 1, "this is my question?1", "choice 1.1", "choice 2.1", "choice 3.1");


        myNode2 = new myNode(2, 1, "this is my question?2", "choice 1.2", "choice 2.2", "choice 3.2");
        myNode3 = new myNode(3, 1, "this is my question?3", "choice 1.3", "choice 2.3", "choice 3.3");


        myNode4 = new myNode(4);
        myNode4.correctChoice = 1;
        myNode4.questionLabel.setText("this is my question?3");
        myNode4.choice1.setText("choice 1.4");
        myNode4.choice2.setText("choice 2.4");
        myNode4.choice3.setText("choice 3.4");


        myNode5 = new myNode(5);




    }
}
