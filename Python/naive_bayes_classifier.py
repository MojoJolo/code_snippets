# References for Naive bayes Classifier
# NLTK is required
from nltk import NaiveBayesClassifier

class Classifier:
  def train(self):
    train_set = []
    # Get training data from file or anywhere

    # Build features
    # Format: Tuple of features + value and label
    # ({features: value, ...}, label)
    # Then append to training data set - train_set

    classifier = NaiveBayesClassifier.train(train_set)
    classifier.show_most_informative_features()
    classifier.classify(test_data)

    None

# References:
# http://www.nltk.org/_modules/nltk/classify/naivebayes.html
# http://www.nltk.org/book/ch06.html
# http://nbviewer.ipython.org/github/carljv/Will_it_Python/blob/master/MLFH/CH3/ch3_nltk.ipynb