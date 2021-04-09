package day5.inner.example;

public class GameRepo implements Repo {

	Game[] games = new Game[5];
	
	GameRepo() {
		games[0] = new Game("월요일 게임", 1);
		games[1] = new Game("화요일 게임", 0);
		games[2] = new Game("수요일 게임", 1);
		games[3] = new Game("목요일 게임", 0);
		games[4] = new Game("금요일 게임", 1);
	}
	
	public Stats getStats() {
		return new GameStats();
	}

	// 인스턴스 내부 클래스
	// 게임기록을 기반으로 총 승리횟수와 승률을 제공하는 Stats 인터페이스 구현 클래스
	private class GameStats implements Stats {

		@Override
		public int total() {
			int totalWin = 0;
			
			for (Game game : games) {
				totalWin += game.getWin();
			}
			
			return totalWin;
		}

		@Override
		public int average() {
			return total()*100 / games.length;
		}
		
	}
}
