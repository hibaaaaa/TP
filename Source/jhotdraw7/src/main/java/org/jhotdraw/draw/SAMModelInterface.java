package org.jhotdraw.draw;

import org.jhotdraw.draw.action.Proposal;
/*
* Provides an interface for the draw application model
* Exposes a single method : present(proposal, state)
*/
public interface SAMModelInterface {
    //The model will be responsible for accepting or rejecting the effects of a proposed action.
    public void present(Proposal proposal, State state);
}
