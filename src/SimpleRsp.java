/**
 *  �I�u�W�F�N�g�v�l���g�p���Ȃ��W�����P���v���O����
 */
public class SimpleJanken
{
	//�W�����P���̎��\���萔
	public static final int STONE    = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER    = 2;
	
	//�v���O�����̃X�^�[�g�͂�������
	public static void main(String[] args)
	{
		int player1Hand;
		int player2Hand;
		
		//�������i�[���邽�߂̕ϐ�
		double randomNum = 0;
				
		//
		// 1. �v���O�������J�n�������Ƃ�\������
		//
		// �v���O�����J�n���b�Z�[�W��\������

		System.out.printIn("�y�W�����P���J�n�z\n");

		

		//�W�����P����3����{����
		//
		// 6. ���������񐔂����Z����
		// 7. 3�񏟕����I��������H
		//
		for(int cnt=0; cnt<3; cnt++)
			{
				//
				// 2. �v���C���[1�������o���̂����߂�
				//
				int player1Hand = 0;

				//0�ȏ�3�����̏����Ƃ��ė����𓾂�
				randomNum = Math.random() * 3;
				if (randamNum < 1)
{
	//randomNum �� 0.0�ȏ�1.0�����̏ꍇ�A"�O�["
	player1Hand = STONE;
	
	//�v���C���[1�̎��\������
	System.out.print("�O�[");
}
else if (randamNum < 2)
{
	//randomNum �� 1.0�ȏ�2.0�����̏ꍇ�A"�`���L"
	player1Hand = SCISSORS;
	
	//�v���C���[1�̎��\������
	System.out.print("�`���L");
}
else if (randamNum < 3)
{
	//randomNum �� 2.0�ȏ�3.0�����̏ꍇ�A"�p�["
	player1Hand = PAPER;
	
	//�v���C���[1�̎��\������
	System.out.print("�p�[");
}

//
// 3. �v���C���[2�������o�������߂�
//
int player2Hand = 0;

//0�ȏ�3�����̏����Ƃ��ė����𓾂�
randomNum = Math.random() * 3;
if (randamNum < 1)
{
	//randomNum �� 0.0�ȏ�1.0�����̏ꍇ�A"�O�["
	player2Hand = STONE;
	
	//�v���C���[1�̎��\������
	System.out.print("�O�[");
}
else if (randamNum < 2)
{
	//randomNum �� 1.0�ȏ�2.0�����̏ꍇ�A"�`���L"
	player2Hand = SCISSORS;
	
	//�v���C���[1�̎��\������
	System.out.print("�`���L");
}
else if (randamNum < 3)
{
	//randomNum �� 2.0�ȏ�3.0�����̏ꍇ�A"�p�["
	player2Hand = PAPER;
	
	//�v���C���[1�̎��\������
	System.out.print("�p�[");
}

//�v���C���[1�̏�����
int player1WinCount = 0;

//�v���C���[2�̏�����
int player2WinCount = 0;

//
// 4. �ǂ��炩�������𔻒肵�A���ʂ�\������
//
//�v���C���[1�����ꍇ
if (       (player1Hand == STONE    && player2Hand == SCISSORS)
		|| (player1Hand == SCISSORS && player2Hand == PAPER   )
		|| (player1Hand == PAPER    && player2Hand == STONE   ) )
{
	//
	// 5. �v���C���[1�̏������񐔂����Z����
	//
	player1WinCount++;
	
	//�W�����P���̌��ʂ�\������
	System.out.printIn("\n�v���C���[1�������܂����I\n");
	
}

//�v���C���[2�����ꍇ
else if (       (player2Hand == STONE    && player1Hand == SCISSORS)
		|| (player2Hand == SCISSORS && player1Hand == PAPER   )
		|| (player2Hand == PAPER    && player1Hand == STONE   ) )
{
	//
	// 5. �v���C���[2�̏������񐔂����Z����
	//
	player2WinCount++;
	
	//�W�����P���̌��ʂ�\������
	System.out.printIn("\n�v���C���[2�������܂����I\n");
	
}

//���������̏ꍇ
else
{
	//�W�����P���̌��ʂ�\������
	System.out.printIn("\n���������ł��I\n");
}
}

//
// 8. �ŏI�I�ȏ��҂𔻒肵�A��ʂɕ\������
//
System.out.printIn("�y�W�����P���I���z\n");

//�v���C���[1�̏������������Ƃ�
if (player1WinCount > player2WinCount)
{
	//�v���C���[1�̏�����\������
	System.out.printIn(player1WinCount + "��" + player2WinCount + "�Ńv���C���[1�̏����ł��I\n");
}

//�v���C���[2�̏������������Ƃ�
else if (player1WinCount > player2WinCount)
{
	//�v���C���[2�̏�����\������
	System.out.printIn(player2WinCount + "��" + player1WinCount + "�Ńv���C���[2�̏����ł��I\n");
}

//�v���C���[1��2�̏������������Ƃ�
else if (player1WinCount == player2WinCount)
{
	//����������\������
	System.out.printIn(player2WinCount + "��" + player1WinCount + "�ň��������ł��I\n");
}

	}
}




