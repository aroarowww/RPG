package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster{
	public Dragon(String name, String weapon) {
		super(name, weapon);
//		5. コンストラクタの中で、ヒットポイントの値は乱数を振って決定します。（乱数の具体的は範囲は後述）
		this.hp = Dice.get(270, 330);
//		6. コンストラクタの中で、攻撃力の値は乱数を振って決定します。
		this.offensive = Dice.get(12, 18);
	}
}
