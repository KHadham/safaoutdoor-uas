package utility;

import java.util.Stack;
import javax.swing.JFrame;

public class Navigator {

    private final Stack<JFrame> screenStack = new Stack<>();

    public interface ParameterizedScreen {

        void setParameters(Object... params);
    }

public void navigateTo(JFrame screen, Object... params) {
    if (screen instanceof ParameterizedScreen) {
        ((ParameterizedScreen) screen).setParameters(params);
    }
    screenStack.push(screen);
    screen.setVisible(true);
}

    public void goBack() {
        if (!screenStack.isEmpty()) {
            JFrame currentScreen = screenStack.pop();
            currentScreen.dispose(); // Dispose of current screen
            JFrame previousScreen = getCurrentScreen();
            if (previousScreen != null) {
                previousScreen.setVisible(true); // Show previous screen
            }
        }
    }

    private JFrame getCurrentScreen() {
        return screenStack.isEmpty() ? null : screenStack.peek();
    }
}
