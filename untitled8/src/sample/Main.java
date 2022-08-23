//Developed by Amar
package sample;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.Math;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.text.*;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Sphere;
import javafx.scene.control.ToggleGroup;
import java.io.FileInputStream;



public class Main extends Application  {
    double i1 = 0;
    double i2 =0;
    double a = 1;
    double b = 1;
    int c=1;
    int d=1;

    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        Image image = new Image(new FileInputStream("C:\\Users\\amare\\Desktop\\wallpapers\\math3.jpg"));
        BackgroundImage i = new BackgroundImage(image, BackgroundRepeat.REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        pane.setBackground(new Background(i));

        TextField tf = new TextField();
        tf.setStyle("-fx-background-color: dimgrey; -fx-text-fill: black;");
        tf.setFont(Font.font(25));
        tf.setMaxWidth(179);
        tf.setMinWidth(179);
        tf.setLayoutX(170);
        tf.setLayoutY(120);
        tf.setText("0");
        tf.setEditable(false);

        Button result = new Button("=");
        result.setStyle("-fx-background-color: firebrick; -fx-text-fill: white;");
        result.setLayoutX(295);
        result.setLayoutY(310);
        Label lb = new Label("Standard");
        lb.setLayoutX(20);
        lb.setLayoutY(20);
        lb.setFont(Font.font(null,FontWeight.LIGHT,FontPosture.ITALIC,35));
        lb.setTextFill(Color.WHITE);

        Button bt1 = new Button("1");
        bt1.setLayoutX(170);
        bt1.setLayoutY(220);
        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+"1");
            }
        });
        Button bt2 = new Button("2");
        bt2.setLayoutX(200);
        bt2.setLayoutY(220);
        bt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+"2");
            }
        });
        Button bt3 = new Button("3");
        bt3.setLayoutX(230);
        bt3.setLayoutY(220);
        bt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+"3");
            }
        });
        Button bt4 = new Button("4");
        bt4.setLayoutX(170);
        bt4.setLayoutY(250);
        bt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+"4");
            }
        });
        Button bt5 = new Button("5");
        bt5.setLayoutX(200);
        bt5.setLayoutY(250);
        bt5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+"5");
            }
        });
        Button bt6 = new Button("6");
        bt6.setLayoutX(230);
        bt6.setLayoutY(250);
        bt6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+"6");
            }
        });
        Button bt7 = new Button("7");
        bt7.setLayoutX(170);
        bt7.setLayoutY(280);
        bt7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+"7");
            }
        });
        Button bt8 = new Button("8");
        bt8.setLayoutX(200);
        bt8.setLayoutY(280);
        bt8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+"8");
            }
        });
        Button bt9 = new Button("9");
        bt9.setLayoutX(230);
        bt9.setLayoutY(280);
        bt9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+"9");
            }
        });
        Button bt0 = new Button("0");
        bt0.setLayoutX(230);
        bt0.setLayoutY(310);
        bt0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+"0");
            }
        });

        Button bt10 = new Button(".");
        bt10.setLayoutX(260);
        bt10.setLayoutY(310);
        bt10.setMaxWidth(28);
        bt10.setMinWidth(28);
        bt10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+".");
            }
        });
        Button bt00 = new Button("00");
        bt00.setLayoutX(170);
        bt00.setLayoutY(310);
        bt00.setMaxWidth(52.5);
        bt00.setMinWidth(52.5);
        bt00.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+"00");
            }
        });


        Button pi = new Button("ℼ");
        pi.setLayoutX(325);
        pi.setLayoutY(310);
        pi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText(tf.getText()+Math.PI);
            }
        });
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                tf.appendText("-");
            }
        };
        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                i1 = i1+Double.parseDouble(tf.getText());
                tf.clear();
                tf.appendText("-");
                result.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        i2 = Double.parseDouble(tf.getText());
                        tf.setText(i1+i2+"");
                        i1=0;
                    }
                });
            }
        };

        Button add = new Button("+");
        add.setLayoutX(295);
        add.setLayoutY(220);
        add.setMaxHeight(54);
        add.setMinHeight(54);
        add.setStyle("-fx-background-color: indigo; -fx-text-fill: white;");
        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent actionEvent) {

                i1 = i1+Double.parseDouble(tf.getText());
                tf.clear();
                result.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        i2 = Double.parseDouble(tf.getText());
                        tf.setText(i1+i2+"");
                        i1=0;
                    }
                });
            }
        });

        Button sub = new Button("-");
        sub.setLayoutX(295);
        sub.setLayoutY(280);
        sub.setMinWidth(24);
        sub.setMaxWidth(24);
        sub.setOnAction(event1);

        Button product = new Button("x");
        product.setLayoutX(260);
        product.setLayoutY(280);
        product.setMaxWidth(28);
        product.setMinWidth(28);

        product.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                sub.addEventHandler(ActionEvent.ACTION,event);

                a = a * Double.parseDouble(tf.getText());
                tf.clear();
                result.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent result) {
                        i2 = Double.parseDouble(tf.getText());
                        tf.setText((a * i2)+ "");
                        a = 1;
                        sub.removeEventHandler(ActionEvent.ACTION,event);
                    }
                });
            }
        });

        Button division = new Button("➗");
        division.setLayoutX(260);
        division.setLayoutY(250);
        division.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                sub.addEventHandler(ActionEvent.ACTION,event);
                if(b==1) {
                    b = (1 / b) * Double.parseDouble(tf.getText());
                }
                else if(b!=1)
                {
                    b = b/ Double.parseDouble(tf.getText());
                }
                tf.clear();
                result.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        i2 = Double.parseDouble(tf.getText());
                        tf.setText(b/i2+"");
                        b = 1;
                        sub.removeEventHandler(ActionEvent.ACTION,event);
                    }
                });
            }
        });
        Button power = new Button("^");
        power.setLayoutX(325);
        power.setLayoutY(220);
        power.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                sub.addEventHandler(ActionEvent.ACTION,event);
                i1 = i1+Double.parseDouble(tf.getText()+"");
                tf.clear();
                result.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        i2 = Double.parseDouble(tf.getText()+"");
                        tf.setText(Math.pow(i1,i2)+"");
                        i1=0;
                        sub.removeEventHandler(ActionEvent.ACTION,event);
                    }
                });
            }
        });
        Button percent = new Button("%");
        percent.setLayoutX(325);
        percent.setLayoutY(250);
        percent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                sub.addEventHandler(ActionEvent.ACTION,event);
                i1 = i1+Double.parseDouble(tf.getText()+"");
                tf.clear();
                result.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        i2 = Double.parseDouble(tf.getText()+"");
                        tf.setText((i1/100)*i2+"");
                        i1=0;
                        sub.removeEventHandler(ActionEvent.ACTION,event);
                    }
                });
            }
        });
        Button sqrt = new Button("√");
        sqrt.setLayoutX(325);
        sqrt.setLayoutY(280);
        sqrt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                sub.addEventHandler(ActionEvent.ACTION,event);
                if(Double.parseDouble(tf.getText())==0) {
                    i1 = 1;
                }
                else
                {
                    i1 =i1+Double.parseDouble(tf.getText());
                }
                tf.clear();
                result.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        i2 = Double.parseDouble(tf.getText()+"");
                        tf.setText(i1*Math.sqrt(i2)+"");
                        i1=0;
                        sub.removeEventHandler(ActionEvent.ACTION,event);
                    }
                });
            }
        });
        Button allc = new Button("AC");
        allc.setLayoutX(260);
        allc.setLayoutY(220);
        allc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.clear();
                a = 1;
                b = 1;
                i1 = 0;
                i2 = 0;
                tf.setText("0");
                sub.removeEventHandler(ActionEvent.ACTION,event);
            }
        });
        RadioButton rb1 = new RadioButton("Standard");
        rb1.setLayoutX(350);
        rb1.setLayoutY(10);
        rb1.setTextFill(Color.WHITE);
        rb1.setFont(Font.font("",FontWeight.SEMI_BOLD,FontPosture.REGULAR,15));
        RadioButton rb2 = new RadioButton("Programmer");
        rb2.setTextFill(Color.WHITE);
        rb2.setFont(Font.font("",FontWeight.SEMI_BOLD,FontPosture.REGULAR,15));
        rb2.setLayoutY(40);
        rb2.setLayoutX(350);
        ToggleGroup t = new ToggleGroup();
        rb1.setToggleGroup(t);
        rb2.setToggleGroup(t);
        rb1.setSelected(true);
        rb1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lb.setText("Standard");
                add.setDisable(false);
                division.setDisable(false);
                product.setDisable(false);
                sub.setDisable(false);
                power.setDisable(false);
                percent.setDisable(false);
                sqrt.setDisable(false);
                pi.setDisable(false);
                bt10.setDisable(false);
                result.setDisable(false);
                tf.setText("0");

                allc.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf.clear();
                        a = 1;
                        b = 1;
                        i1 = 0;
                        i2 = 0;
                        tf.setText("0");
                        sub.removeEventHandler(ActionEvent.ACTION,event);
                    }
                });

                Pane p1 = new Pane();
                p1.setBackground(new Background(i));
                p1.getChildren().addAll(rb1, rb2,lb,tf, bt1, bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,bt10,bt00,add, product,result,allc,division,sub,power,sqrt,percent,pi);
                Scene s1 = new Scene(p1, 500, 400);
                primaryStage.setScene(s1);
            }
        });

        rb2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lb.setText("Programmer");
                add.setDisable(true);
                division.setDisable(true);
                product.setDisable(true);
                sub.setDisable(true);
                power.setDisable(true);
                percent.setDisable(true);
                sqrt.setDisable(true);
                pi.setDisable(true);
                bt10.setDisable(true);
                result.setDisable(true);
                tf.setText("0");
                Pane p2 = new Pane();
                TextField binary = new TextField("BIN: 0");
                binary.setStyle("-fx-background-color: dimgrey; -fx-text-fill: snow;");
                binary.setFont(Font.font(15));
                binary.setMaxWidth(100);
                binary.setMinWidth(100);
                binary.setLayoutX(20);
                binary.setLayoutY(220);
                binary.setEditable(false);
                TextField oct = new TextField("OCT: 0");
                oct.setStyle("-fx-background-color: dimgrey; -fx-text-fill: snow;");
                oct.setFont(Font.font(15));
                oct.setMaxWidth(100);
                oct.setMinWidth(100);
                oct.setLayoutX(20);
                oct.setLayoutY(270);
                oct.setEditable(false);
                TextField hex = new TextField("HEX: 0");
                hex.setStyle("-fx-background-color: dimgrey; -fx-text-fill: snow;");
                hex.setFont(Font.font(15));
                hex.setMaxWidth(100);
                hex.setMinWidth(100);
                hex.setLayoutX(20);
                hex.setLayoutY(320);
                hex.setEditable(false);
                Button minus = new Button("-");
                minus.setLayoutX(295);
                minus.setLayoutY(280);
                minus.setMinWidth(24);
                minus.setMaxWidth(24);
                minus.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        tf.setText("-");
                    }
                });
                TextField dec = new TextField();
                dec.setLayoutX(20);
                dec.setLayoutY(135);
                dec.setMinWidth(40);
                dec.setMaxWidth(40);
                Button not = new Button("~");
                not.setLayoutX(120);
                not.setLayoutY(135);
                not.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {

                        if(dec.getText().isEmpty()) {
                            dec.setText(~Integer.parseInt(tf.getText())+"");
                            hex.setText("HEX: " + Integer.toHexString(Integer.parseInt(dec.getText())));
                            hex.setText(hex.getText().toUpperCase());
                            binary.setText("BIN: " + Integer.toBinaryString(Integer.parseInt(dec.getText())));
                            oct.setText("OCT: " + Integer.toOctalString(Integer.parseInt(dec.getText())));
                        }
                        else
                        {
                            dec.setText(~Integer.parseInt(dec.getText())+"");
                            hex.setText("HEX: " + Integer.toHexString(Integer.parseInt(dec.getText())));
                            hex.setText(hex.getText().toUpperCase());
                            binary.setText("BIN: " + Integer.toBinaryString(Integer.parseInt(dec.getText())));
                            oct.setText("OCT: " + Integer.toOctalString(Integer.parseInt(dec.getText())));
                        }
                    }
                });
                Button lhs = new Button("<<");
                lhs.setStyle("-fx-background-color: black ; -fx-text-fill: white;");
                lhs.setLayoutX(170);
                lhs.setLayoutY(188);
                lhs.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        result.setDisable(false);
                        c = c * Integer.parseInt(tf.getText());
                        tf.clear();
                        result.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent result) {
                                d = Integer.parseInt(tf.getText());
                                tf.setText((c<<d)+ "");
                                c = 1;
                            }
                        });
                    }
                });
                Button rhs = new Button(">>");
                rhs.setStyle("-fx-background-color: black; -fx-text-fill: white;");
                rhs.setLayoutX(315);
                rhs.setLayoutY(188);
                rhs.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        result.setDisable(false);
                        c = c * Integer.parseInt(tf.getText());
                        tf.clear();
                        result.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent result) {
                                d = Integer.parseInt(tf.getText());
                                tf.setText((c>>d)+ "");
                                c = 1;
                            }
                        });
                    }
                });
                Button convert = new Button("</>");
                convert.setStyle("-fx-background-color: orange ; -fx-text-fill: white;");
                convert.setLayoutX(240);
                convert.setLayoutY(185);
                convert.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        dec.clear();
                        hex.setText("HEX: " + Integer.toHexString(Integer.parseInt(tf.getText())));
                        hex.setText(hex.getText().toUpperCase());
                        binary.setText("BIN: " + Integer.toBinaryString(Integer.parseInt(tf.getText())));
                        oct.setText("OCT: " + Integer.toOctalString(Integer.parseInt(tf.getText())));
                    }
                });

                allc.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        hex.setText("HEX: 0");
                        binary.setText("BIN: 0");
                        oct.setText("OCT: 0");
                        tf.setText("0");
                        dec.clear();
                        result.setDisable(true);
                    }
                });

                p2.setBackground(new Background(i));
                p2.getChildren().addAll(rhs,lhs,dec,minus,not,convert,binary,oct,hex,rb1, rb2, lb, tf, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, bt10, bt00, add, product, result, allc, division, sub, power, sqrt, percent, pi);
                Scene s1 = new Scene(p2, 500, 400);
                primaryStage.setScene(s1);
            }
        });
        pane.getChildren().addAll(rb1,rb2,lb,tf, bt1, bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,bt10,bt00,add, product,result,allc,division,sub,power,sqrt,percent,pi);
        Scene scene = new Scene(pane, 500, 400);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}


