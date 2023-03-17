package org.howard.edu.lsp.midterm.problem51;

import org.w3c.dom.DOMException;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Node;
import org.w3c.dom.ranges.Range;
import org.w3c.dom.ranges.RangeException;

public class IntegerRange implements Range {
    private int lower;
    private int upper;

    public IntegerRange(int lowerBound, int upperBound) {
        this.lower = lowerBound;
        this.upper = upperBound;
    }

    public boolean contains(int value) {
        return value >= lower && value <= upper;
    }

    public boolean overlaps(Range other) throws EmptyRangeException {
        if (other == null) {
            throw new EmptyRangeException();
        }
        return !(this.lower> ((IntegerRange) other).getUpper() || this.upper < ((IntegerRange) other).getLower());
    }

    public int size() {
        return upper - lower + 1;
    }

    public int getLower() {
        return lower;
    }

    public int getUpper() {
        return upper;
    }

	@Override
	public Node getStartContainer() throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStartOffset() throws DOMException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Node getEndContainer() throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEndOffset() throws DOMException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getCollapsed() throws DOMException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Node getCommonAncestorContainer() throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStart(Node refNode, int offset) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnd(Node refNode, int offset) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStartBefore(Node refNode) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStartAfter(Node refNode) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEndBefore(Node refNode) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEndAfter(Node refNode) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collapse(boolean toStart) throws DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectNode(Node refNode) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectNodeContents(Node refNode) throws RangeException, DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public short compareBoundaryPoints(short how, Range sourceRange) throws DOMException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteContents() throws DOMException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DocumentFragment extractContents() throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocumentFragment cloneContents() throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertNode(Node newNode) throws DOMException, RangeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surroundContents(Node newParent) throws DOMException, RangeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Range cloneRange() throws DOMException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void detach() throws DOMException {
		// TODO Auto-generated method stub
		
	}
}

