	package GoalPioneers.Algorithms.Search;
	

	/**
	 *
	 */
	public abstract class SearchOrder
	{
		/**
		 *
		 * @return
		 */
		public abstract Element previous();
		
		/**
		 *
		 * @return
		 */
		public abstract Element current();
		
		/**
		 *
		 * @return
		 */
		public abstract Element next();
	}
