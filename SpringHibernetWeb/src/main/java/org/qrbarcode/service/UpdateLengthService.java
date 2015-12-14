package org.qrbarcode.service;

import java.util.List;
import org.qrbarcode.model.UpdateLength;

public abstract interface UpdateLengthService {
	
	public abstract void updateLength(UpdateLength updateLength);
	public abstract boolean checkMRN(UpdateLength updateLength);
}
