package myselfgame;

import java.util.HashMap;

public class Room {
	private String description;
	private HashMap<String,Room> exits=new HashMap<String,Room>();
//	private Room northExit;
//	private Room southExit;
//	private Room eastExit;
//	private Room westExit;

	public Room(String description) {
		this.description = description;
	}

	public void setExit(String dir,Room room){
		exits.put(dir, room);
	}
	// 判断出口的函数
//	public void setExits(Room north, Room south, Room east, Room west) {// 北 南 东
//																		// 西
//		if (north != null)
//			northExit = north;
//		if (east != null)
//			eastExit = east;
//		if (south != null)
//			southExit = south;
//		if (west != null)
//			westExit = west;
//
//	}

	// 用toString方法输出有出口的方向字符的函数
	public String getExitdesc() {
		StringBuffer sb = new StringBuffer();
		for(String dir:exits.keySet()){
			sb.append(dir);
			sb.append(' ');
		}
//		if (northExit != null) {
//			sb.append("north  ");
//		}
//		if (southExit != null) {
//			sb.append("south  ");
//		}
//		if (eastExit != null) {
//			sb.append("east  ");
//		}
//		if (westExit != null) {
//			sb.append("west  ");
//		}
		return sb.toString();
	}

	// 指令字段的判断函数
	public Room getExit(String direction) {
		Room ret=null;
		ret = exits.get(direction);
//		if (direction.equals("north")) {
//			ret = northExit;
//		}
//		if (direction.equals("east")) {
//			ret = eastExit;
//		}
//		if (direction.equals("south")) {
//			ret = southExit;
//		}
//		if (direction.equals("west")) {
//			ret = westExit;
//		}
		return ret;
	}

	// toString的使用
	public String toString() {
		return description;
	}
}
