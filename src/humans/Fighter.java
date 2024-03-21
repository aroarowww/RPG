package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	public Fighter(String name, String weapon) {
		super(name, weapon);
//		5. コンストラクタの中で、ヒットポイントの値は乱数を振って決定します。（乱数の具体的は範囲は後述）
		this.hp = Dice.get(240, 300);
//		6. コンストラクタの中で、攻撃力の値は乱数を振って決定します。
		this.offensive = Dice.get(17, 23);
	}
}
