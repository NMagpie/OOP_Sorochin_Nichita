package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;

import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicBoolean;

public class Main extends Application {

    @Override
    public void  start(Stage primaryStage) throws Exception{
        GridPane root= new GridPane();
        root.setGridLinesVisible(false);

        TextField input1 = new TextField();
        input1.setPrefWidth(165);
        input1.setText("First number");
        TextField input2 = new TextField();
        input2.setPrefWidth(165);
        input2.setText("Second number");

        AtomicBoolean ue= new AtomicBoolean(false);

        root.add(input1,0,0);
        root.add(new Label("/"),1,0);
        root.add(input2,2,0);
        root.add(new Label("="),3,0);

        Label lbl = new Label();
        Label errlb = new Label();
        Label errlb1 = new Label();
        Label errlb2 = new Label();
        Button btn = new Button("Result");
        btn.setOnAction(event -> {
            root.getChildren().remove(lbl);
            root.getChildren().remove(errlb);
            root.getChildren().remove(errlb1);
            root.getChildren().remove(errlb2);

            /*if (input1.getText().equals("")||input2.getText().equals("")||input1.getText().equals(null)||input2.getText().equals(null)) {
                errlb.setText("The inputs cannot be empty");
                errlb.setTranslateX(10);
                root.add(errlb,0,3);
                throw new NumberFormatException("The inputs cannot be empty"); } */
            try {
                Double.parseDouble(input1.getText());
                Double.parseDouble(input2.getText());
            } catch (NumberFormatException e) {
                errlb.setText("The inputs cannot be empty\nand must contain only number");
                errlb.setTranslateX(10);
                root.add(errlb,0,3);
            }

            String s= (Double.toString(Double.parseDouble(input1.getText())
                    /Double.parseDouble(input2.getText())));

            //Since I used Double datatype dividing by zero is not an exception, every case has its own value, so I used 'throw'
            //to show these errors.

            if (s.equals("Infinity")||(s.equals("NaN"))) {
                errlb1.setText("You cannot divide by 0");
                errlb1.setTranslateX(10);
                root.getChildren().remove(errlb1);
                root.add(errlb1,0,3);
                throw new ArithmeticException("You cannot divide by zero");
            }

            Double i1=Double.parseDouble(input1.getText());

            if ((i1 instanceof Double)&&(Double.parseDouble(input2.getText())==13)) {
                try {
                    errlb2.setText("Unlucky Exception caught");
                    errlb2.setTranslateX(10);
                    root.add(errlb2,0,3);
                    ue.set(true);
                    throw new UnluckyException("It is unlucky exception");
                } catch (UnluckyException e) {
                    e.printStackTrace();
                }
            }
            if (ue.get()) {
            lbl.setText("");} else lbl.setText(s);
            ue.set(false);
            lbl.setTranslateY(10);
            lbl.setTranslateX(10);
            root.add(lbl,4,0);
        });
        root.add(btn,4, 1);

        root.getChildren().forEach(node -> { if (node.equals(btn)) { node.setTranslateX(40); node.setTranslateY(20);  } else {
            node.setTranslateX(10); node.setTranslateY(10);
        }
        });

        root.setHgap(10);

        primaryStage.setTitle("Division");
        primaryStage.setResizable(false);

        primaryStage.setScene(new Scene(root, 530, 100));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}