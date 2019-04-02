package enums;

import pattern.Art;
import pattern.Strategy;

public enum CategoriaLivro {
	ARTE {
		@Override
		public Strategy getCategory() {
			return new Art();
		}
	},
	AJUDA {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	BIOGRAFIA {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	EXATAS {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	EDUCAÇÃO {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	HUMANAS {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	COMIDAS {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	DIREITO {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	HISTORIA {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	ESTRANGEIRO {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	INFANTIL {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	NACIONAL {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	NEGOCIOS {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	HQ {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	SAUDE {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	TECNOLOGIA {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	TURISMO {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	TUDO {
		@Override
		public Strategy getCategory() {
			// TODO Auto-generated method stub
			return null;
		}
	};

	public abstract Strategy getCategory();
}
