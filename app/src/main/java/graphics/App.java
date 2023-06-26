/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graphics;

import javax.swing.JFrame;

import graphics.linalg.Vector3;
import graphics.model.Scene;
import graphics.model.Triangle;
import graphics.model.Vertex;
import graphics.shaders.OrthogonalView;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void showOrthogonalProjection() {
        Scene scene = new Scene(new Triangle(
                new Vertex(new Vector3(0, 0, 0)),
                new Vertex(new Vector3(1, 0, 0)),
                new Vertex(new Vector3(0, 0, 1))));

        JFrame frame = new JFrame("Orthogonal Projection");
        frame.setSize(540, 540);

        OrthogonalView panel = new OrthogonalView();

        panel.scene = scene;

        frame.add(panel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        showOrthogonalProjection();
    }
}
