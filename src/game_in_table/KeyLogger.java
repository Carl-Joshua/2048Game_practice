//package game_in_table;
//
//public class KeyLogger {
//    frame.addKeyListener(new KeyListener() {
//
//        int upCount = 0;
//        int downCount = 0;
//        int rightCount = 0;
//        int leftCount = 0;
//
//        @Override
//        public void keyTyped(KeyEvent e) {
//            // TODO Auto-generated method stub
//
//        }
//
//        @Override
//        public void keyPressed(KeyEvent e) {
//            int keyCode = e.getKeyCode();
//            switch (keyCode) {
//                case KeyEvent.VK_UP:
//                    up.setText("Up: " + Integer.toString(upCount++));
//                    break;
//                case KeyEvent.VK_DOWN:
//                    down.setText("Down: " + Integer.toString(downCount++));
//                    break;
//                case KeyEvent.VK_RIGHT:
//                    right.setText("Right: " + Integer.toString(rightCount++));
//                    break;
//                case KeyEvent.VK_LEFT:
//                    left.setText("Left: " + Integer.toString(leftCount++));
//                    break;
//            }
//        }
//
//        @Override
//        public void keyReleased(KeyEvent e) {
//            // TODO Auto-generated method stub
//
//        }
//
//    });
//}
