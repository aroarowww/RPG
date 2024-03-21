package bases;

import utils.Dice;

public abstract class Human extends Living{
	protected String name;
	protected String weapon;
	// コンストラクタ
	public Human(String name, String weapon) {
		super(name, weapon);
	}
	@Override
//	 3-1. 引数でもらった Living型のtargetインスタンスを攻撃する相手のインスタンスとします。
	public void attack(Living target) {
//	  3-2. Diceクラスを利用して1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージ値（整数）とします。
		int num = Dice.get(1, 10);
		int damage = num * this.offensive;
//	  3-3. 攻撃されたtargetの持つHPをダメージ分だけ減らします
		target.setHp(target.getHp() - damage);
//	  3-4. 人間の場合は、攻撃を仕掛けた際に　自分の攻撃力も1だけ減るとします
		if (target instanceof Human) {
			this.offensive -= 1;
		}
//	  3-5. コンソールに、以下のようにステータス文字列（〇〇は人間の名前、✕✕は人間の武器の名前、△△はtargetの名前、▲▲はダメージ値）を表示します
//	　　　　「〇〇」が「✕✕」で攻撃！「△△」に▲▲のダメージを与えた。しかし自分の攻撃力も1減少した。
		System.out.println(this.name + this.weapon + "で攻撃！" + target.getName() + "に" + damage + "のダメージを与えた。");
		System.out.println("しかし自分の攻撃力も1減少した。");
	}
}
