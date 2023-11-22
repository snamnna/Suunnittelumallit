package flyweightjavafx;

import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public enum BorderFactory {
	INSTANCE;

	private Border shareableRedBorder = new Border(new BorderStroke(Color.RED,
			BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

	private Border shareableGreenBorder = new Border(new BorderStroke(Color.GREEN,
			BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

	public Border getRedBorder() {
		return shareableRedBorder;
	}

	public Border getGreenBorder() {
		return shareableGreenBorder;
	}
}
