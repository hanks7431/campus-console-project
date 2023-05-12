/*

PyramidModel은 피라미드의 층수를 저장하는 클래스입니다.
setFloor 메서드는 층수를 설정합니다.
getFloor 메서드는 현재 층수를 반환합니다.

 */

package campus_console_project_leader_side.한경수;

public class PyramidModel {
    private int floor;

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }
}
