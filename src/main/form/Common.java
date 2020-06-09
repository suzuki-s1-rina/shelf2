package main.form;

public class Common {

	public enum Mode {

        DISP("表示"),	// 表示
        REGiST("登録"),	// 登録
        DELETE("削除");	// 削除

        private String name;

        /*
         * コンストラクタ
         */
        private Mode(String name) {
        	this.name = name;
        }

        public String getName() {
        	return this.name;
        }
    }


}
