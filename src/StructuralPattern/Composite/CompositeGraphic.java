package StructuralPattern.Composite;

/**
 * @author chenzhang
 * @date 2024/11/30 13:56
 */
public class CompositeGraphic implements Graphic{
    private Graphic[] graphics = new Graphic[10];
    private int index = 0;

    public void add(Graphic graphic)
    {
        graphics[index++] = graphic;
    }

    public void remove(Graphic graphic)
    {
        for (int i = 0; i < index; i++) {
            if (graphics[i] == graphic) {
                for (int j = i; j < index - 1; j++) {
                    graphics[j] = graphics[j + 1];
                }
                index--;
            }
        }
    }

    public void move(int x, int y)
    {
        for (Graphic graphic : graphics) {
            graphic.move(x, y);
        }
    }

    public void draw()
    {
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}
