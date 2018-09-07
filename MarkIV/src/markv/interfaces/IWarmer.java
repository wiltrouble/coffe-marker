package markv.interfaces;

import markv.enums.*;

public interface IWarmer {
	WarmerState getWarmerState();
	void setWarmerState(WarmerState warmerState);
}
