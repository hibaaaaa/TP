package org.jhotdraw.draw;

import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D.Double;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.swing.Action;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoableEdit;

import org.jhotdraw.draw.action.Proposal;
import org.jhotdraw.draw.connector.Connector;
import org.jhotdraw.draw.event.CompositeFigureListener;
import org.jhotdraw.draw.event.FigureListener;
import org.jhotdraw.draw.handle.Handle;
import org.jhotdraw.draw.io.InputFormat;
import org.jhotdraw.draw.io.OutputFormat;
import org.jhotdraw.draw.layouter.Layouter;
import org.jhotdraw.draw.tool.Tool;
import org.jhotdraw.geom.Dimension2DDouble;
import org.jhotdraw.xml.DOMInput;
import org.jhotdraw.xml.DOMOutput;

/*
 * Translates the model property values into a State Representation
 * Computes the control state and trigger the next-action predicate
 */
public class State implements Drawing {
	
	private static final long serialVersionUID = 1L;

	//Il faut migrer la logique de toutes les opérations à cette classe
	//Puisqu'elle est responsable de modifier l'état de l'application

	public Figure removeChild(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeAllChildren() {
		// TODO Auto-generated method stub
		
	}

	public Figure basicRemoveChild(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public void basicRemoveAllChildren() {
		// TODO Auto-generated method stub
		
	}

	public List<Figure> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getChildCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Figure getChild(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(Figure child) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean contains(Figure f) {
		// TODO Auto-generated method stub
		return false;
	}

	public Layouter getLayouter() {
		// TODO Auto-generated method stub
		return null;
	}

	public void layout() {
		// TODO Auto-generated method stub
		
	}

	public void setLayouter(Layouter newValue) {
		// TODO Auto-generated method stub
		
	}

	public void addCompositeFigureListener(CompositeFigureListener listener) {
		// TODO Auto-generated method stub
		
	}

	public void removeCompositeFigureListener(CompositeFigureListener listener) {
		// TODO Auto-generated method stub
		
	}

	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

	public int getLayer() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setBounds(Double start, Double end) {
		// TODO Auto-generated method stub
		
	}

	public Double getStartPoint() {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getEndPoint() {
		// TODO Auto-generated method stub
		return null;
	}

	public java.awt.geom.Rectangle2D.Double getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	public java.awt.geom.Rectangle2D.Double getDrawingArea() {
		// TODO Auto-generated method stub
		return null;
	}

	public Dimension2DDouble getPreferredSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean contains(Double p) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getTransformRestoreData() {
		// TODO Auto-generated method stub
		return null;
	}

	public void restoreTransformTo(Object restoreData) {
		// TODO Auto-generated method stub
		
	}

	public void transform(AffineTransform tx) {
		// TODO Auto-generated method stub
		
	}

	public <T> void set(AttributeKey<T> key, T value) {
		// TODO Auto-generated method stub
		
	}

	public <T> T get(AttributeKey<T> key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<AttributeKey, Object> getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAttributesRestoreData() {
		// TODO Auto-generated method stub
		return null;
	}

	public void restoreAttributesTo(Object restoreData) {
		// TODO Auto-generated method stub
		
	}

	public boolean isSelectable() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isRemovable() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTransformable() {
		// TODO Auto-generated method stub
		return false;
	}

	public Collection<Handle> createHandles(int detailLevel) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cursor getCursor(Double p) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Action> getActions(Double p) {
		// TODO Auto-generated method stub
		return null;
	}

	public Tool getTool(Double p) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getToolTipText(Double p) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isConnectable() {
		// TODO Auto-generated method stub
		return false;
	}

	public Connector findConnector(Double p, ConnectionFigure prototype) {
		// TODO Auto-generated method stub
		return null;
	}

	public Connector findCompatibleConnector(Connector c, boolean isStartConnector) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Connector> getConnectors(ConnectionFigure prototype) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean includes(Figure figure) {
		// TODO Auto-generated method stub
		return false;
	}

	public Collection<Figure> getDecomposition() {
		// TODO Auto-generated method stub
		return null;
	}

	public Figure clone() {
		// TODO Auto-generated method stub
		return null;
	}

	public void remap(Map<Figure, Figure> oldToNew, boolean disconnectIfNotInMap) {
		// TODO Auto-generated method stub
		
	}

	public void addNotify(Drawing d) {
		// TODO Auto-generated method stub
		
	}

	public void removeNotify(Drawing d) {
		// TODO Auto-generated method stub
		
	}

	public void willChange() {
		// TODO Auto-generated method stub
		
	}

	public void changed() {
		// TODO Auto-generated method stub
		
	}

	public void requestRemove() {
		// TODO Auto-generated method stub
		
	}

	public boolean handleDrop(Double p, Collection<Figure> droppedFigures, DrawingView view) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean handleMouseClick(Double p, MouseEvent evt, DrawingView view) {
		// TODO Auto-generated method stub
		return false;
	}

	public void addFigureListener(FigureListener l) {
		// TODO Auto-generated method stub
		
	}

	public void removeFigureListener(FigureListener l) {
		// TODO Auto-generated method stub
		
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	public void write(DOMOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	public void read(DOMInput in) throws IOException {
		// TODO Auto-generated method stub
		
	}

	public void present(Proposal proposal, State state) {
		// TODO Auto-generated method stub
		
	}

	public void drawCanvas(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

	public boolean add(Figure figure) {
		// TODO Auto-generated method stub
		return false;
	}

	public void add(int index, Figure figure) {
		// TODO Auto-generated method stub
		
	}

	public void addAll(Collection<? extends Figure> figures) {
		// TODO Auto-generated method stub
		
	}

	public void addAll(int index, Collection<? extends Figure> figures) {
		// TODO Auto-generated method stub
		
	}

	public boolean remove(Figure figure) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeAll(Collection<? extends Figure> figures) {
		// TODO Auto-generated method stub
		
	}

	public int basicRemove(Figure figure) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void basicRemoveAll(Collection<? extends Figure> figures) {
		// TODO Auto-generated method stub
		
	}

	public void basicAdd(Figure figure) {
		// TODO Auto-generated method stub
		
	}

	public void basicAdd(int index, Figure figure) {
		// TODO Auto-generated method stub
		
	}

	public void basicAddAll(int index, Collection<? extends Figure> figures) {
		// TODO Auto-generated method stub
		
	}

	public List<Figure> findFigures(java.awt.geom.Rectangle2D.Double bounds) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Figure> findFiguresWithin(java.awt.geom.Rectangle2D.Double bounds) {
		// TODO Auto-generated method stub
		return null;
	}

	public Figure findFigure(Double p) {
		// TODO Auto-generated method stub
		return null;
	}

	public Figure findFigureExcept(Double p, Figure ignore) {
		// TODO Auto-generated method stub
		return null;
	}

	public Figure findFigureExcept(Double p, Collection<? extends Figure> ignore) {
		// TODO Auto-generated method stub
		return null;
	}

	public Figure findFigureBehind(Double p, Figure figure) {
		// TODO Auto-generated method stub
		return null;
	}

	public Figure findFigureBehind(Double p, Collection<? extends Figure> figures) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Figure> getFiguresFrontToBack() {
		// TODO Auto-generated method stub
		return null;
	}

	public Figure findFigureInside(Double p) {
		// TODO Auto-generated method stub
		return null;
	}

	public void sendToBack(Proposal proposal, State state) {
		// TODO Auto-generated method stub
		
	}

	public void bringToFront(Proposal proposal, State state) {
		// TODO Auto-generated method stub
		
	}

	public List<Figure> sort(Collection<? extends Figure> figures) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addUndoableEditListener(UndoableEditListener l) {
		// TODO Auto-generated method stub
		
	}

	public void removeUndoableEditListener(UndoableEditListener l) {
		// TODO Auto-generated method stub
		
	}

	public void fireUndoableEditHappened(UndoableEdit edit) {
		// TODO Auto-generated method stub
		
	}

	public FontRenderContext getFontRenderContext() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setFontRenderContext(FontRenderContext frc) {
		// TODO Auto-generated method stub
		
	}

	public Object getLock() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addInputFormat(InputFormat format) {
		// TODO Auto-generated method stub
		
	}

	public void addOutputFormat(OutputFormat format) {
		// TODO Auto-generated method stub
		
	}

	public void setInputFormats(List<InputFormat> formats) {
		// TODO Auto-generated method stub
		
	}

	public List<InputFormat> getInputFormats() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setOutputFormats(List<OutputFormat> formats) {
		// TODO Auto-generated method stub
		
	}

	public List<OutputFormat> getOutputFormats() {
		// TODO Auto-generated method stub
		return null;
	}
	
    
}

