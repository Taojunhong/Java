package myselfgame;

public class Room {
	private String description;
	private Room northExit;
	private Room southExit;
	private Room eastExit;
	private Room westExit;

	public Room(String description) {
		this.description = description;
	}

	// �жϳ��ڵĺ���
	public void setExits(Room north, Room south, Room east, Room west) {// �� �� ��
																		// ��
		if (north != null)
			northExit = north;
		if (east != null)
			eastExit = east;
		if (south != null)
			southExit = south;
		if (west != null)
			westExit = west;

	}

	// ��toString��������г��ڵķ����ַ��ĺ���
	public String getExitdesc() {
		StringBuffer sb = new StringBuffer();
		if (northExit != null) {
			sb.append("north  ");
		}
		if (southExit != null) {
			sb.append("south  ");
		}
		if (eastExit != null) {
			sb.append("east  ");
		}
		if (westExit != null) {
			sb.append("west  ");
		}
		return sb.toString();
	}

	// ָ���ֶε��жϺ���
	public Room getExit(String direction) {
		Room ret = null;
		if (direction.equals("north")) {
			ret = northExit;
		}
		if (direction.equals("east")) {
			ret = eastExit;
		}
		if (direction.equals("south")) {
			ret = southExit;
		}
		if (direction.equals("west")) {
			ret = westExit;
		}
		return ret;
	}

	// toString��ʹ��
	public String toString() {
		return description;
	}
}
