package record_202111;

import java.awt.*;
import java.security.cert.PolicyNode;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/perfect-rectangle/
 * 391. 完美矩形
 */
public class _1116_isRectangleCover {
    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            return x + y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Point) {
                Point p2 = (Point) obj;
                return this.x == p2.x && this.y == p2.y;
            }
            return false;
        }
    }

    public boolean isRectangleCover(int[][] rectangles) {
        long area=0;
        int minX=rectangles[0][0];
        int minY=rectangles[0][1];
        int maxX=rectangles[0][2];
        int maxY=rectangles[0][3];
        Map<Point,Integer> map=new HashMap<>();
        for(int[] rect:rectangles){
            int x1=rect[0],y1=rect[1],x2=rect[2],y2=rect[3];
            area+=(long)(x2-x1)*(y2-y1);
            minX=Math.min(minX,x1);
            minY=Math.min(minY,y1);
            maxX=Math.max(maxX,x2);
            maxY=Math.max(maxY,y2);
            Point p1=new Point(x1,y1);
            Point p2=new Point(x1,y2);
            Point p3=new Point(x2,y1);
            Point p4=new Point(x2,y2);
            map.put(p1,map.getOrDefault(p1,0)+1);
            map.put(p2,map.getOrDefault(p2,0)+1);
            map.put(p3,map.getOrDefault(p3,0)+1);
            map.put(p4,map.getOrDefault(p4,0)+1);

        }
        Point p1=new Point(minX,minY);
        Point p2=new Point(minX,maxY);
        Point p3=new Point(maxX,minY);
        Point p4=new Point(maxX,maxY);
        if(area!=(long)(maxX-minX)*(maxY-minY)||map.getOrDefault(p1,0)!=1||map.getOrDefault(p2,0)!=1
                ||map.getOrDefault(p3,0)!=1||map.getOrDefault(p4,0)!=1){
            return false;
        }
        map.remove(p1);
        map.remove(p2);
        map.remove(p3);
        map.remove(p4);
        for(Map.Entry<Point,Integer> entry:map.entrySet()){
            int value=entry.getValue();
            if(value!=2&&value!=4){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] rectangles = {{1,1,3,3},{3,1,4,2},{3,2,4,4},{1,3,2,4},{2,3,3,4}};
        System.out.println(new _1116_isRectangleCover().isRectangleCover(rectangles));
    }
}
