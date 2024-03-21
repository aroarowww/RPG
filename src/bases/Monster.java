package bases;

import utils.Dice;

public abstract class Monster extends Living {
	protected String name;
	protected String weapon;
	// コンストラクタ
	public Monster(String name, String weapon) {
		super(name, weapon);
	}
	@Override
//	  3-1. 引数でもらった Living型のtargetインスタンスを攻撃する相手のインスタンスとします。
//	　　　　「〇〇」が「✕✕」で攻撃！「△△」に▲▲のダメージを与えた。
	public void attack(Living target) {
//	  3-2. Diceクラスを利用して1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージ値（整数）とします。	
		int num = Dice.get(1, 10);
		int damage = num * this.offensive;
//	  3-3. 攻撃されたtargetの持つHPをダメージ分だけ減らします
		target.setHp(target.getHp() - damage);
//	  3-4. コンソールに、以下のようにステータス文字列（〇〇はモンスターの名前、✕✕はモンスターの武器の名前、△△はtargetの名前、▲▲はダメージ値）を表示します
		System.out.println(this.name + this.weapon + "で攻撃！" + target.getName() + "に" + damage + "のダメージを与えた。");
	}
}
