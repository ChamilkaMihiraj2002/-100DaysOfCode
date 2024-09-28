#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *link;
};

void count_of_node(struct node *);
void display(struct node *);
void del_pos(struct node **, int);

int main()
{
    struct node *head = (struct node *)malloc(sizeof(struct node));
    head->data = 45;
    head->link = NULL;

    struct node *current = (struct node *)malloc(sizeof(struct node));
    current->data = 50;
    current->link = NULL;

    head->link = current;

    current = (struct node *)malloc(sizeof(struct node));
    current->data = 75;
    current->link = NULL;

    head->link->link = current;

    count_of_node(head);
    display(head);

    del_pos(&head, 2);

    count_of_node(head);
    display(head);

    return 0;
}

void count_of_node(struct node *head)
{
    int count = 0;
    if (head == NULL)
    {
        printf("Linked list is Empty!!\n");
    }

    // create a pointer
    struct node *ptr = NULL;
    ptr = head;

    while (ptr != NULL)
    {
        count++;
        ptr = ptr->link;
    }
    printf("Count of Node :: %d\n", count);
}

void display(struct node *head)
{
    if (head == NULL)
    {
        printf("Linked list is Empty!!\n");
    }

    // Craete a pointer
    struct node *ptr = head;

    while (ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr = ptr->link;
    }
    printf("\n");
}

void del_pos(struct node **head, int position)
{
    struct node *current = *head;
    struct node *previous = *head;

    if (*head == NULL)
    {
        printf("Linked list is empty!!!");
    }
    else if (position == 1)
    {
        *head = current->link;
        free(current);
        current = NULL;
    }
    else
    {
        while (position != 1)
        {
            previous = current;
            current = current->link;
            position--;
        }
        previous->link = current->link;
        free(current);
        current = NULL;
    }
}